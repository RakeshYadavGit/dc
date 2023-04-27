import java.rmi.*;

public interface SampleServer extends Remote
{
  public double sum(int a,int b) throws RemoteException;
}

// javac *.java
// start rmiregistry
// rmic SampleServerImpl
// java SampleServerImpl
// java SampleClient

// start rmiregistry
// rmic SampleServerImpl
// java –Djava.security.policy=policy.all SampleServerImpl
// java –Djava.security.policy=policy.all SampleClient