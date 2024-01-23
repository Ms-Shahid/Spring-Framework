package org.spring.springstarter.stubs;

public class RetrieveRequiredData {

    private DataService dataService;

    public RetrieveRequiredData(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int getHighestValueFromData(){
        int[] data = dataService.retrieveData();
        int greatestValue = Integer.MIN_VALUE;
        for(int val : data){
            if( val > greatestValue ) greatestValue = val;
        }
        return greatestValue;
    }

}

