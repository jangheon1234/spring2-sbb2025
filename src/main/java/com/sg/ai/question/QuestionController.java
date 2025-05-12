package com.sg.ai.question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@GetMapping("/question/list")
//	@ResponseBody
	public String list(Model model) {
		
		List<Question> questionList = this.questionRepository.findAll();
		model.addAttribute("auestionList", questionList);
		return "question_list";
	};
}
