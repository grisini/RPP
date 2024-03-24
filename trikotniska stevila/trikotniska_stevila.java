import java.util.Scanner;

public class trikotniska_stevila {

    static int n, matrika[][], maxCenter, centerN;
    
    public static void main(String[] args){

        Scanner vhod = new Scanner(System.in);

        while(true){
            System.out.println("Vnesite dimenzijo polja:");
            n = vhod.nextInt();
            matrika = new int[n][n];
            maxCenter = (n%2==0 && n%2==0) ? 4 : 2;//ce je n sodo izpise 4 in v naslednji vrstici vklopi izbiro center elementa, v nasprotnem primeru je liho (zapise 2)
            if (maxCenter == 4){ //centriranje zacetka
                System.out.println("Napisite center element: 1 - " + maxCenter);
                centerN = vhod.nextInt();//izbira zacetka
            }
            start();
        }
    }
 
    public static void start(){
        
        int i=n/2, j=n/2;//zacetek za sode
        
        if((n%2 == 0 && centerN==1) || (maxCenter>2 && centerN==2)) i=n/2-1; // zacetek za lihe zgoraj
        if((n%2 == 0 && centerN==4) || (maxCenter>2 && centerN==3)) j=n/2-1;// zacetek za lihe spodaj

        int smer=0, koraki=1, trenutni_korak=0, sprememba=0; //koraki (st korakov ki jih je potrebno narediti v smeri), trenutni so ze bili narejeni
 
        for (int a = 1; a <= n*n; a++){//zanka se bo izvedla n*n krat
            if (i<0 || i>=n || j<0 || j>=n) a--; //ce so indeksi znotraj meja se zmanjsa a da se ponovno izvede korak      
            else matrika[i][j] = a;// se dodeli mesto v matriki
            
            if (trenutni_korak < koraki) //ce trenutni korak se ni dodegel pricakobanih se poveca trenutni korak
                trenutni_korak++;
            else {
                trenutni_korak = 1;// ce je trenutni_korak dosegel koraki, se izvede ta blok kode. Ponastavi se trenutni_korak, poveca se smer in po potrebi se poveca koraki
                if (sprememba == 1) koraki++;
                sprememba = (sprememba+1) % 2;
                smer = (smer+1) % 4;
            }
            
            switch (smer){//dejanja glede na smer
                case 0: j++; break;
                case 1: i++; break;
                case 2: j--; break;
                case 3: i--; break;
            }
        }
        printMatrix();
    }
    
    public static void printMatrix(){


        for (int i = 0; i < n; i++){//vrstice
            for (int j = 0; j < n; j++){//stolpci
                System.out.print(((matrika[i][j] * (matrika[i][j] + 1)) / 2) + "\t");//tisk trikotniskih stevil in tabularke
        }
            System.out.println();//zakljucek vrstice
        }
    }
    
    }
