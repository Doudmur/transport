public abstract class transport {

}

class publicTransport extends transport{

}

interface ticketBuy{
    void payTicket();
}

class bus extends publicTransport implements ticketBuy{
    public void payTicket(){
        System.out.println("Buy bus Ticket");
    }
}

class trolleybus extends publicTransport implements ticketBuy{
    public void payTicket() {
        System.out.println("Buy trolley Ticket");
    }
}

class minibus extends publicTransport implements ticketBuy{
    public void payTicket() {
        System.out.println("Buy minibus Ticket");
    }
}

class armyTransport{

}

class tank extends armyTransport{

}

class katyusha extends armyTransport{

}

class ecoTransport{

}

class bicycle extends ecoTransport{

}

class jet extends ecoTransport{

}




