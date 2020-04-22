package com.patroclos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.patroclos.MyTopicConsumer;
import com.patroclos.model.Message;
@Controller
public class KafkaMVCController {

	@Autowired
	private KafkaTemplate<String, String> template;
	@Autowired
	private MyTopicConsumer myTopicConsumer;


	@GetMapping({"/","/kafka"})
	public String index(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("messages",myTopicConsumer.getMessages());
		return "kafkaadmin";
	}

	@PostMapping("/kafka/sentmessage")
	public String formPost(Message message, Model model) {
		if (message==null || message.getBody()==null || message.getBody().isBlank()) {
			message = new Message();
			message.setBody("Please enter valid message");
		}else
			template.send("myTopic", message.getBody());

		model.addAttribute("message", message);
		
		return "kafkaadmin";
	}

	@GetMapping({"/kafka/messages"})
	public String messages(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("messages",myTopicConsumer.getMessages());
		return "kafkamessages";
	}

}
