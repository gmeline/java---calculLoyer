package loyer;

import java.util.Scanner;

public class calculLoyer {
    public static void main(String[] args) {
        //Liste des mois pour la première colonnes du tableau
        String[] mois ={"Janvier","Février","Mars","Avril","Mai","Juin","Juillet","Août","Septembre","Octobre","Novembre","Décembre"};
        
        // Tableau pour chaque colonne
        double[] echeance = new double[12];
        double[] caf = new double[12];
        double[] virement = new double[12];
        double[] difference = new double[12];
        double[] differenceCumulee =new double[12];

        
        Scanner scanner = new Scanner(System.in);

        double cumul=0.0;
        // Saisie des données pour chaque mois
        for (int i =0; i<12;i++){
            
            // Entrer le loyer à payer
            System.out.println("Entrez le loyer à payer pour le mois de "+mois[i]+" : ");
            echeance[i] = scanner.nextDouble();

            // Entrer le montant viré par la CAF
            System.out.println("Entrer le montant du virement de la CAF au mois de "+mois[i]+" : ");
            caf[i]=scanner.nextDouble();

            // Entrer le montant effectué par virement
            System.out.println("Enter le montant du virement que vous avez effectué au mois de "+mois[i]+" : ");
            virement[i]=scanner.nextDouble();

            // Calcul de la différence
            difference[i] = (caf[i]+virement[i])-echeance[i];
            System.out.println();

            // Cumul de la différence
            cumul+= difference[i];
            differenceCumulee[i]=cumul;
            System.out.println();
        }

        // Affichage du tableau récapitulatif
        System.out.println("\nRécapitulatif des loyers :");
        System.out.printf("%-10s %-15s %-15s %-15s %-20s%n","Mois","Loyer à payer","CAF","Virement","Différence");
        for (int i=0;i<12;i++){
            System.out.printf("%-10s %-15.2f %-15.2f %-15.2f %-20.2f%n",mois[i],echeance[i],caf[i],virement[i],differenceCumulee[i]);
        }
        
    }
}
