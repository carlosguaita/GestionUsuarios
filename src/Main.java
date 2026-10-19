//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    int opc = 0;

    Scanner sc = new Scanner(System.in);
    SistemaCLI sis = new SistemaCLI();

    do{
        opc = sis.menu();
        switch (opc){
            case 1:
                sis.crearUsuario();
                break;
            case 2:
                sis.mostrarUsuarios();
                break;
            default:
                System.out.println("No existe la opcion");
            break;
        }
        System.out.println("Desea seleccionar otra opcion 1.Si/2.No: ");
        opc = sc.nextInt();
    }while(opc == 1);


}
