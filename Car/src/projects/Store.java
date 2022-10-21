package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Store {
    private List<Common> avalibleCommons;
    private List<Public> avaliblePublics;
    private List<Vehicle> soldVehicles;

    public Store() {
        this.avalibleCommons = new ArrayList<Common>();
        this.avaliblePublics = new ArrayList<Public>();
        this.soldVehicles = new ArrayList<Vehicle>();
    }

    public Store(List<Common> avalibleCommons, List<Public> avaliblePublics, List<Vehicle> soldVehicles) {
        this.avalibleCommons = avalibleCommons;
        this.avaliblePublics = avaliblePublics;
        this.soldVehicles = soldVehicles;
    }

    public List<Common> getAvalibleCommons() {
        return avalibleCommons;
    }
    public void setAvalibleCommons(List<Common> avalibleCommons) {
        this.avalibleCommons = avalibleCommons;
    }
    public List<Public> getAvaliblePublics() {
        return avaliblePublics;
    }
    public void setAvaliblePublics(List<Public> avaliblePublics) {
        this.avaliblePublics = avaliblePublics;
    }
    public List<Vehicle> getSoldVehicles() {
        return soldVehicles;
    }
    public void setSoldVehicles(List<Vehicle> soldVehicles) {
        this.soldVehicles = soldVehicles;
    }

    public void registerVehicle(Vehicle vehicle) {
        if (vehicle instanceof Public) {
            avaliblePublics.add((Public) vehicle);
        } else {
            avalibleCommons.add((Common) vehicle);
        }
    }

    public void sellVehicle(Vehicle vehicle) {
        if (vehicle instanceof Public) {
            avaliblePublics.remove((Public) vehicle);
            soldVehicles.add(vehicle);
        } else {
            avalibleCommons.remove((Common) vehicle);
            soldVehicles.add(vehicle);
        }
    }

    public List showVehicle() {
        List<Vehicle> vehicleList = new ArrayList<>(avaliblePublics);
        vehicleList.addAll(avalibleCommons);
        return vehicleList;
    }

    public List searchVehiclePrice(int parm, int price) {
        if (parm == 1) {
            List<Common> commonList = new ArrayList<>();
            for (Common availableCommon : avalibleCommons) {
                if (availableCommon.getValue() <= price) {
                    commonList.add(availableCommon);
                }
            }
            return commonList;
        } else {
            List<Public> publicList = new ArrayList<>();
            for (Public availablePublic : avaliblePublics) {
                if (availablePublic.getValue() <= price) {
                    publicList.add(availablePublic);
                }
            }
            return publicList;
        }
    }

    public List searchVehicleModel(int parm, int model) {
        if (parm == 1) {
            List<Common> commonList = new ArrayList<>();
            for (Common availableCommon : avalibleCommons) {
                if (availableCommon.getModel() == model) {
                    commonList.add(availableCommon);
                }
            }
            return commonList;
        } else {
            List<Public> publicList = new ArrayList<>();
            for (Public availablePublic : avaliblePublics) {
                if (availablePublic.getModel() == model) {
                    publicList.add(availablePublic);
                }
            }
            return publicList;
        }
    }

    public void orderVehiclePrice() {
        avalibleCommons.sort(Comparator.comparingInt(Vehicle::getValue));
        avaliblePublics.sort(Comparator.comparingInt(Vehicle::getValue));
    }

    public void orderVehicleModel() {
        avalibleCommons.sort(Comparator.comparingInt(Vehicle::getModel));
        avaliblePublics.sort(Comparator.comparingInt(Vehicle::getModel));
    }
}
