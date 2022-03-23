public class Cliente  implements Autenticavel{
    private String senha = "abc";

    @Override
    public boolean autenticar(String senha) {
        return this.senha == senha;
    }
}