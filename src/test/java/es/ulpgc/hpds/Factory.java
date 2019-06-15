package es.ulpgc.hpds;

public class Factory {
    public static StateBase CreateState(String state){
        switch (state){
            case "AL": { return new Alabama(); }
            case "GA": { return new Georgia(); }
            case "KY": { return new Kentucky(); }
            case "SC": { return new SouthCarolina(); }
        }
        return new Alabama();
    }
}
