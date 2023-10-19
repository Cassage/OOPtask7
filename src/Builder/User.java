package Builder;

public class User {

    String name;
    String surname;

    String patronymic;

    public User(UserBuilder userBuilder) {
        name = userBuilder.name;
        surname = userBuilder.surname;
        patronymic = userBuilder.patronymic;
    }

    public static class UserBuilder {
        String name;
        String surname;

        String patronymic;

        public UserBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public UserBuilder setPatronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
