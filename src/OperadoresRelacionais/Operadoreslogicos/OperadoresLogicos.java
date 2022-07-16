package OperadoresRelacionais.Operadoreslogicos;

public class OperadoresLogicos {
    public static void main(String[] arg) {

        boolean b1 = true;
        boolean b2= false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2" + (b1 && b2));
        System.out.println("b1 && b3" + (b1 && b3));

        System.out.println("b2 || b3" + (b2 || b3));
        System.out.println("b2 || b4" + (b2 || b4));

        System.out.println("b1 ^ b3" + (b1 ^ b3));
        System.out.println("b4 ^ b1" +(b4 ^ b4));

        System.out.println(!b1);
        System.out.println(!b2);

        int t1 = 10;
        int t2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((t1 + t2) < (f2 - f1)) && true" + ((t1 + t2) < (f2 - f1) && true));
        System.out.println("(t1 > t2) || (f2 < f1)" + ((t1 > t2) || (f2 < f1)));

        double salarioMensal = 11803.50d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("recebe auxílio" + (recebeAuxilio));    }
}
