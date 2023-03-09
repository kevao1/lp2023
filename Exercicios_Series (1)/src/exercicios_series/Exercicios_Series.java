
 
package exercicios_series;

import javax.swing.JOptionPane;
        
public class Exercicios_Series {

    static int serie1 (){
        int i= 1;
        int soma1= 0;
        while(i<=100){
            soma1 = soma1 + i;
            i = i + 1;
        }return (soma1);
}
    static double serie2 (double seq){
        double i = 0;
        double serie = 0;
        while (i < seq){
            serie = serie + (seq - i);
            i = i+ 1;
        }return (serie);                
}
    static double serie3 (double N){
        double i = 1;
        double serie =0;
        while (i<=N){
            serie = serie + 1/i;
            i = i + 1;
        }return (serie);
    }
    static double serie4 (double N){
        double i = 0;
        double serie = 0;
        while (i < N){
            if (i==0){
                serie = serie + (N/1);
            }else{
                serie = serie + ((N - i)/(i+1));     
                        }
            i = i+ 1;
        }return (serie);
    } 
    static double serie5 (double N){
        double total = 0;
        double i;
        double r;
        double serie;
        while (N >= 0){
            i = N;
            r= 0;
            serie = 1;
            while (i>0){
                serie = serie * i;
                i= i - 1;
                r = serie;
            }total = r + total;
            N= N-1;
            
        }return (total);
        }
    
        
        
    
public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "1 - (1+2+3+...+100)" + "\n2 - (N) + (N-1) + (N-2) + ... + (1) + " + "\n3 - (1/1) + (1/2) + (1/3) + ....+ (1/N)"   + "\n4 - (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)"  + "\n5 - (N)! + (N-1)! + (N-2)! + ... + (1)!", "Visualize as opções:", JOptionPane.DEFAULT_OPTION);
    int alt;
    double N;
    alt = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um dos métodos anteriores (Digite 1 se quiser o primeiro, 2 para o segundo, etc."));
    switch(alt){
        case 1:
            JOptionPane.showMessageDialog(null,Exercicios_Series.serie1());
            break;
        case 2:
            N = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira N."));
            JOptionPane.showMessageDialog(null,Exercicios_Series.serie2(N));
            break;
        case 3:
            N = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira N."));
            JOptionPane.showMessageDialog(null,Exercicios_Series.serie3(N));
            break;
        case 4:
            N = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira N."));
            JOptionPane.showMessageDialog(null, Exercicios_Series.serie4(N));
            break;
        case 5:
            N = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira N."));
            JOptionPane.showMessageDialog(null, Exercicios_Series.serie5(N));
            break;    }
}
}
