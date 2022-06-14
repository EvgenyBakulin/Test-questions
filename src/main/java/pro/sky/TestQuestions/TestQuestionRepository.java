package pro.sky.TestQuestions;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;

@Repository("TestRepository")
public class TestQuestionRepository {
    private final Set<TestQuestions> questions;

    public TestQuestionRepository() {
        this.questions = new HashSet<>();
    }
    @PostConstruct
    public void initial(){
        questions.add(new TestQuestions("Сколько месяцев в году?", List.of("1). 14","2). 12","3). 8"),2));
        questions.add(new TestQuestions("Какие из этих животных ТОЛЬКО дикие?", List.of("1). Лошадь, корова, волк",
                "2). Медведь, лиса, овца","3). Лев, барсук, заяц"),3));
        questions.add(new TestQuestions("Сколько будет 3 умножить на 10?", List.of("1). 30","2). 27","3). 14"),1));
        questions.add(new TestQuestions("Как пишется слово \"В*Л*СИПЕ*\"?", List.of("1). ВЕЛОСИПЕД","2). ВИЛАСИПЕТ","3). ВЕЛОСИПЕТ"),1));
        questions.add(new TestQuestions("Чего нельзя делать в лесу?", List.of("1). Бегать","2). Собирать грибы","3). Мусорить"),3));
    }

    public Collection<TestQuestions> getAll() { return Collections.unmodifiableCollection(questions);}
}
