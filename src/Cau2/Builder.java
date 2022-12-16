package Cau2;

public interface Builder {
    Builder builderMa(String ma);
    Builder builderName(String name);

    Builder builderPhone(String phone);
    Teacher build();
}
