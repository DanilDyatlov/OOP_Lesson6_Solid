package solid.isp;

import jdk.jshell.spi.ExecutionControl;

public interface PayablePhoneNomber {
    void payPhoneNumber(int amount) throws ExecutionControl.NotImplementedException;
}
