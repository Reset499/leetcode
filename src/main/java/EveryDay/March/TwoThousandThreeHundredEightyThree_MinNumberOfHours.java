package EveryDay.March;

public class TwoThousandThreeHundredEightyThree_MinNumberOfHours {
    public static void main(String[] args) {

    }
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int result = 0;
        for(int i = 0;i<energy.length;i++){
            if(initialEnergy>energy[i]&&initialExperience>experience[i]){
                initialEnergy -= energy[i];
                initialExperience += experience[i];
            }else{
                result+=initialEnergy<=energy[i]?energy[i]-initialEnergy+1:0;
                initialEnergy = initialEnergy<=energy[i]?1:initialEnergy-energy[i];
                result+=initialExperience<=experience[i]?experience[i]-initialExperience+1:0;
                initialExperience = initialExperience<=experience[i]?experience[i]*2+1:initialExperience+experience[i];
            }
        }
        return result;
    }
}
