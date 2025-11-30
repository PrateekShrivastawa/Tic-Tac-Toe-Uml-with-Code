package TicTacToe;

public class Player {
    private String name;
    private PlayerSymbolBaseClass playerSymbol;

    public Player(String name, PlayerSymbolBaseClass playerSymbol) {
        this.name = name;
        this.playerSymbol = playerSymbol;
    }

    public String getName() {
        return name;
    }

    public PlayerSymbolBaseClass getPlayerSymbol() {
        return playerSymbol;
    }
}
