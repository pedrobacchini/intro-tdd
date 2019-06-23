package com.github.pedrobacchini.tdd.person;

class PersonController {

    private PersonDAO personDAO;
    private LogGenerator log;

    PersonController(LogGenerator log) {
        this.personDAO = new PersonDAO();
        this.log = log;
    }

    void delete(Person person) {
        personDAO.delete(person);
        log.createLog(person.getName());
    }
}


