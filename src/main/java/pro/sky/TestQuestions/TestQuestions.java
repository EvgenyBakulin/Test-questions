package pro.sky.TestQuestions;

import java.util.List;
import java.util.Objects;

public class TestQuestions {
    private String question;
    private List<String> answers;
    private int answer;

    public TestQuestions( String question, List<String> answers, int answer) {
        this.question = question;
        this.answers = answers;
        this.answer = answer;
    }

    public String getQuestion() { return question;}
    public List<String> getAnswers() { return answers;}
    public int getAnswer() { return answer;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestQuestions tq = (TestQuestions) o;
        return question.equals(tq.question) && answers.equals(tq.answers) &&
                answer == tq.answer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(question,answers,answer);
    }

    @Override
    public String toString() {
        String s = "";
        for (String a : answers) {
            s+=a+'/';
        }
        return question+"\n"+s;
    }

}
