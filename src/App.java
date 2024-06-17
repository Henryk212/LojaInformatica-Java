import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.CarrinhoController;
import controller.EcommerceController;
import controller.ProdutoController;
import controller.UsuarioController;
import controller.menu.IMenu;
import controller.menu.MenuBase;
import controller.menu.MenuController;
import controller.menu.MenuPrincipal;
import model.Categoria;
import model.Produto;
import model.Usuario;

public class App {
    public static void main(String[] args) {
        EcommerceController ecommerceController = new EcommerceController();
        MenuController menuController = new MenuController();

        fakeUser(ecommerceController);
        fakeProdutosInfomatica(ecommerceController);

        MenuBase menuPrincipal = new MenuPrincipal(menuController, ecommerceController);
        UsuarioController usuarioController = new UsuarioController(menuController, ecommerceController);
        CarrinhoController carrinhoController = new CarrinhoController(menuController, ecommerceController);
        ProdutoController produtoController = new ProdutoController(menuController, ecommerceController);

        List<IMenu> menus = new ArrayList<>();
        menus.addAll(Arrays.asList(menuPrincipal, usuarioController, produtoController, carrinhoController));

        menuController.setMenus(menus);
        menuController.setMenuAtual(menuPrincipal);

        while (true) {
            menuController.mostraMenuAtual();
            menuController.gerenciaOpcao();
        }
    }

    private static void fakeUser(EcommerceController ecommerceController) {
        Usuario usuario = new Usuario("Teste", "teste@teste.com", "123", "123");
        ecommerceController.adicionarUsuario(usuario);
    }

    private static void fakeProdutosInfomatica(EcommerceController ecommerceController)
    {
        Categoria categoria = new Categoria("Periféricos", "Periféricos de computador");
        Produto produto1 = new Produto("Mouse Razer", "3200 DPI", 150, 10, categoria);
        Produto produto2 = new Produto("Teclado Mecânico", "Switch Cherry MX", 300, 5, categoria);
        Produto produto3 = new Produto("Monitor 24", "144Hz", 1000, 3, categoria);

        List<Produto> produtos = new ArrayList<>();
        produtos.addAll(Arrays.asList(produto1, produto2, produto3));
        ecommerceController.setProdutos(produtos);

    }
}
