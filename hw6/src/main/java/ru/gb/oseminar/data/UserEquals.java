package ru.gb.oseminar.data;

import java.time.LocalDate;

public class UserEquals extends User {

    public UserEquals(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}
