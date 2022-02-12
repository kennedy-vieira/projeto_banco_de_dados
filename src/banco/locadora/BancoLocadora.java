/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.locadora;

/**
 *
 * @author sabri
 */
public class BancoLocadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexao con = new Conexao();
        //Cadastrar_cliente cadastro_cliente = new Cadastrar_cliente(con);
        Cadastrar_usuario cadastro_usuario = new Cadastrar_usuario(con);
        cadastro_usuario.setVisible(true);
    }
    
}
