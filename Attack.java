public class Attack implements Action {
    @Override
    public String name() {
        return "たたかう"; //このアクションの名称（ユーザーに提示される）
    }
 
    @Override
    /**
     * 実際に実行されるアクションの処理．本クラスでは武器で攻撃
     * @param executer アクションを実行するキャラクタのインスタンスが入っている
     * @param target アクションの実行対象（攻撃対象)が入っている
     */
    public void execute(Character executer, Character target) {
        target.hp -= executer.attack;//これはダメな例！！次週以降修正
        System.out.println(executer.name + "の攻撃!!");
        System.out.println(executer.name + "は" + target.name + 
                    "に" + executer.attack + "ポイントのダメージを与えた!");
    }
 }
 