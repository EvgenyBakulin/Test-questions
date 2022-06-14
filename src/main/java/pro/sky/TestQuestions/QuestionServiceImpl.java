package pro.sky.TestQuestions;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

@Service
public class QuestionServiceImpl implements QuestionService {
    private final TestQuestionRepository repository;
    private TestQuestions q = new TestQuestions();
    private final Random rand = new Random();
    private List<TestQuestions> list;
    private int result = 0;

    public QuestionServiceImpl(TestQuestionRepository repository) {
        this.repository = repository;
        this.list = new ArrayList<>(repository.getAll());
    }

    public TestQuestions getRandomQuestion() {
        if (list.size()==0) {throw new RuntimeException();}
        else{
        int i = abs(rand.nextInt(list.size()));
        q = list.get(i);
        list.remove(i);}
        return q;
    }

    public String isRight(int answer) {
        if (q == null) {
            throw new RuntimeException();
        }
        if (answer == q.getAnswer()) {
            result++;
            if (list.size()==0)
            {return "Правильно!\nТест окончен!";}
            else {
                return "Правильно!";
            }
        } else {
            if(list.size()==0){
                { return "Неправильно!\nТест окончен!";}
            }
            else {return "Неправильно!";}
        }

    }

    public int getResult(){
        return result;
    }
}
