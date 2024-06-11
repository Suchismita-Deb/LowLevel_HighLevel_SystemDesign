package org.example.LowLevelDesignSystemExample.DesignCarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {

    List<Store> storeList;
    List<User> userList;

    VehicleRentalSystem(List<Store> stores, List<User> users){
        this.storeList = stores;
        this.userList = users;
    }

    public Store getStore(Location location){
        // based on the location we will filter out the store from the storeList.
        return storeList.get(0);
    }
    // add user.
    // remove user.
    // add store.
    // remove store.
}
