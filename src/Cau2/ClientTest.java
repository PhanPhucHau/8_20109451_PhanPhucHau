package Cau2;

public class ClientTest {
    public static void main(String[] args) {
        Teacher teacher = new TeacherBuilder().builderMa("1").builderName("Phúc Hậu").builderPhone("20109451").build();
        System.out.println(teacher);
    }
}
