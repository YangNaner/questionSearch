package top.yn.entity;

public class Question {
    private Long Id;
    private String Type;
    private String Info;
    private String Answer;
    private String Select_1;
    private String Select_2;
    private String Select_3;
    private String Select_4;
    private String Select_5;
    private String Select_6;

//    Getter & Setter

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getSelect_1() {
        return Select_1;
    }

    public void setSelect_1(String select_1) {
        Select_1 = select_1;
    }

    public String getSelect_2() {
        return Select_2;
    }

    public void setSelect_2(String select_2) {
        Select_2 = select_2;
    }

    public String getSelect_3() {
        return Select_3;
    }

    public void setSelect_3(String select_3) {
        Select_3 = select_3;
    }

    public String getSelect_4() {
        return Select_4;
    }

    public void setSelect_4(String select_4) {
        Select_4 = select_4;
    }

    public String getSelect_5() {
        return Select_5;
    }

    public void setSelect_5(String select_5) {
        Select_5 = select_5;
    }

    public String getSelect_6() {
        return Select_6;
    }

    public void setSelect_6(String select_6) {
        Select_6 = select_6;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Id=" + Id +
                ", Type='" + Type + '\'' +
                ", Info='" + Info + '\'' +
                ", Answer='" + Answer + '\'' +
                ", Select_1='" + Select_1 + '\'' +
                ", Select_2='" + Select_2 + '\'' +
                ", Select_3='" + Select_3 + '\'' +
                ", Select_4='" + Select_4 + '\'' +
                ", Select_5='" + Select_5 + '\'' +
                ", Select_6='" + Select_6 + '\'' +
                '}';
    }
}
