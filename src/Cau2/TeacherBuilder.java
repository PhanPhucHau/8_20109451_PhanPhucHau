package Cau2;

public class TeacherBuilder implements Builder{
    private String id;
    private String name;
    private String phone;


    @Override
    public Builder builderMa(String ma) {
        this.id = ma;
        return this;
    }

    @Override
    public Builder builderName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder builderPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public Teacher build() {
        return new Teacher(id, name, phone);
    }
}
