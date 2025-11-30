package TicTacToe;

public class PlayerSymbolBaseClass {
    private SupportedSymbol supportedSymbol;

    public PlayerSymbolBaseClass(SupportedSymbol supportedSymbol){
        this.supportedSymbol=supportedSymbol;
    }

    public SupportedSymbol getSupportedSymbol() {
        return supportedSymbol;
    }
}
