package abstract_factory;

import abstract_factory.factory.*;
/*
 * 
 * 問題8-1
 * Privateにした場合、trayフィールドの操作はTrayクラスで公開されているAPIに限定される。
 * 利点: カプセル化によって、安全性が高まる。(解答: Trayのサブクラスが, trayフィールドの実装に依存しない)
 * 欠点: tray操作の柔軟性が損なわれる可能性がある。充分なAPIを用意する場合Trayクラスで必要なメソッド定義を行わなければならず、クラスが肥大化する可能性がある。
 * 問題8-3
 * 明示的なコンストラクタの定義を行わない場合、0引数のコンストラクタが暗黙的に定義されてしまうため。
 * (解答: Javaではコンストラクタは継承されないため)
 * 問題8-4
 * Pageクラスにはcaptionフィールドが不要で、コンストラクタの引数が一致しないため。
 * (PageはTrayにaddすることは出来ないため)
 */
public class Main {
	public static void main(String[] args) {
		Factory factory = Factory.getFactory("abstract_factory.list_factory.ListFactory");
		Link yomiuri = factory.createLink("読売新聞", "http://yomiuri.co.jp");
		Link asahi = factory.createLink("朝日新聞", "http://asahi.com");
		Link jp_yahoo = factory.createLink("Yahoo!", "http://yahoo.co.jp");
		Link us_yahoo = factory.createLink("Yahoo!Japan", "http://yahoo.com");
		Link google = factory.createLink("Google", "http://google.com");
		Link excite = factory.createLink("Excite", "http://excite.com");

		Tray traynews = factory.createTray("新聞");
		traynews.add(yomiuri);
		traynews.add(asahi);

		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(jp_yahoo);
		trayyahoo.add(us_yahoo);
		
		Tray traysearch = factory.createTray("サーチエンジン");
		traysearch.add(trayyahoo);
		traysearch.add(google);
		traysearch.add(excite);
		
		Page page = factory.createPage("LinkPage", "結城浩");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
