package com.newx.headfirst.designer.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xuzhijian on 2018/2/28 0028.
 */
public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
