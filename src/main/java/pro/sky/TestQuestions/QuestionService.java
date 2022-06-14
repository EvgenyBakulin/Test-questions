package pro.sky.TestQuestions;

public interface QuestionService {

    TestQuestions getRandomQuestion();

    String isRight(int answer);

    int  getResult();
}
