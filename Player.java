import java.util.ArrayList;
public class Player extends Character {

    Player(String name, int hp, int mp, int attack) {
        super(name, hp, mp, attack);
    }
 
    @Override
    void act(ArrayList<Character> targets) {
        var command_selector = new CommandSeleector();
        
        //アクションを選択
         for(var action: actions) {
             command_selector.addCommand(action.name());
         }
         var command_number = command_selector.waitForUsersCommand("コマンド？");
 
        //ターゲットを選択
         command_selector.clearCommands();
         for(var target: targets) {
             command_selector.addCommand(target.name);
         }
         var target_number = command_selector.waitForUsersCommand("ターゲット？");
 
         actions.get(command_number).execute(this, targets.get(target_number));
         //           ^ユーザが選択したアクション番号                 ^選択したターゲット番号
    }
}

 
 