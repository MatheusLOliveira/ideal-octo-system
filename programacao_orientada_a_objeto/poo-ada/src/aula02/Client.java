package aula02;

import java.util.Objects;

public class Client {

    private String name;
    private String cpf;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    @Override
    public boolean equals(Object client) {
        if (client instanceof Client clientToCompare) {
            return this.cpf.equals(clientToCompare.cpf);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Client:\n" +
                "Name = " + name + "\n" +
                "CPF = " + cpf + '\n' +
                "Email = " + email + '\n';
    }
}
