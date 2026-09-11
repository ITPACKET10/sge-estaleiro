package mz.co.sge.model;

public class Usuario {

    private long id;
    private String nome;
    private String username;
    private String senha;
    private String perfil;

    public Usuario() {
    }

    public Usuario(long id, String nome, String username, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.perfil = perfil;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}