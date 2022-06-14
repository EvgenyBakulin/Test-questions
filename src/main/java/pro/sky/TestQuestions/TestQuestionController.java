package pro.sky.TestQuestions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/тест")
public class TestQuestionController {
    private final QuestionService questionService;

    public TestQuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/вопрос")
    public String getQuestion(){
        return questionService.getRandomQuestion().toString();
    }

    @GetMapping("/вопрос/{amount}")
    public String isRight(@PathVariable int amount){
        return questionService.isRight(amount);
    }

    @GetMapping("/оценка")
    public String getResult(){
        return "Ваш результат - "+questionService.getResult()+" баллов!";
    }
}
