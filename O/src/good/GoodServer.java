package good;

import bad.BadClient;

public class GoodServer {
    public void reactToClient(Client_I client) {
        client.doSomething();
    }
}
