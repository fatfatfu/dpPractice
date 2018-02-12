package org.myProj.dpPractice;

import org.myProj.dpPractice.AbstractFactoryPattern.AbstractWidgetFactory;
import org.myProj.dpPractice.AbstractFactoryPattern.GUIBuilder;
import org.myProj.dpPractice.AbstractFactoryPattern.MacOSXWidgetFactory;
import org.myProj.dpPractice.AbstractFactoryPattern.MsWindowsWidgetFactory;
import org.myProj.dpPractice.AdapterPattern.HomeComingMovie;
import org.myProj.dpPractice.AdapterPattern.IronMan;
import org.myProj.dpPractice.AdapterPattern.SpiderMan;
import org.myProj.dpPractice.BridgePattern.Iphone;
import org.myProj.dpPractice.BridgePattern.MobileBrand;
import org.myProj.dpPractice.BridgePattern.MobileGame;
import org.myProj.dpPractice.BridgePattern.MobileTool;
import org.myProj.dpPractice.BridgePattern.SamSung;
import org.myProj.dpPractice.BuilderPattern.Meal;
import org.myProj.dpPractice.BuilderPattern.MealBuilder;
import org.myProj.dpPractice.CompositePattern.ConcreteCompany;
import org.myProj.dpPractice.CompositePattern.HRDepartment;
import org.myProj.dpPractice.CompositePattern.ITDepartment;
import org.myProj.dpPractice.DecoratorDesignPattern.Circle;
import org.myProj.dpPractice.DecoratorDesignPattern.ColorShapeDecorator;
import org.myProj.dpPractice.DecoratorDesignPattern.Shape;
import org.myProj.dpPractice.FacadePattern.Fund;
import org.myProj.dpPractice.FactoryMethodDesignPattern.Ifactory;
import org.myProj.dpPractice.FactoryMethodDesignPattern.OperationFactory;
import org.myProj.dpPractice.IteratorPattern.ConcreteIterator;
import org.myProj.dpPractice.IteratorPattern.ConcreteIteratorDesc;
import org.myProj.dpPractice.IteratorPattern.Iterator;
import org.myProj.dpPractice.MementoPattern.CareTaker;
import org.myProj.dpPractice.MementoPattern.Originator;
import org.myProj.dpPractice.ObserverPattern.NewsObserver;
import org.myProj.dpPractice.ObserverPattern.StockObserver;
import org.myProj.dpPractice.ObserverPattern.Subject;
import org.myProj.dpPractice.ProtoType.ShapeCache;
import org.myProj.dpPractice.ProtoType.ShapeProtoType;
import org.myProj.dpPractice.ProxyDesignPattern.FtpFile;
import org.myProj.dpPractice.ProxyDesignPattern.ProxyFtpFile;
import org.myProj.dpPractice.SingletonPattern.SingleObject;
import org.myProj.dpPractice.StatePattern.Context;
import org.myProj.dpPractice.StatePattern.ElevatorStopState;
import org.myProj.dpPractice.StrategyDesignPattern.BreakingBall;
import org.myProj.dpPractice.StrategyDesignPattern.CurveBall;
import org.myProj.dpPractice.StrategyDesignPattern.Slider;
//import org.myProj.dpPractice.StrategyDesignPattern.StrategyOperation;
import org.myProj.dpPractice.TemplatePattern.BaseBallGame;
import org.myProj.dpPractice.TemplatePattern.BasketBallGame;
import org.myProj.dpPractice.TemplatePattern.GameTemplate;
//import org.myProj.dpPractice.domain.OperationAddV2;
import org.myProj.dpPractice.domain.OperationFather;
//import org.myProj.dpPractice.domain.OperationSubV2;
import org.myProj.dpPractice.domain.SimpleOperation;

/**
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("SIMPLE FACTORY:");
		simpleFactory();
		System.out.println("\n\nStregy Pattern:");
		strategyPattern();
		System.out.println("\n\nDecorator Pattern:");
		decoratorPattern();
		System.out.println("\n\nProxy Pattern:");
		proxyPattern();
		System.out.println("\n\nFactory Method Pattern:");
		factoryMethodPattern();
		System.out.println("\n\nProtoType Pattern:");
		try {
			protoTypePattern();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("\n\nTemplate Pattern:");
		templatePattern();
		System.out.println("\n\nFacade Pattern:");
		facadePattern();
		System.out.println("\n\nBuilder Pattern:");
		builderPattern();
		System.out.println("\n\nObserver Pattern:");
		observerPattern();
		System.out.println("\n\nAbstract Factory Pattern:");
		abstractFactoryPattern();
		System.out.println("\n\nState Pattern:");
		statePattern();
		System.out.println("\n\nAdapter Pattern:");
		adapterPattern();
		System.out.println("\n\nMemento Pattern:");
		mementoPattern();
		System.out.println("\n\nComposite Pattern:");
		compositePattern();
		System.out.println("\n\nIterater Pattern:");
		iteratorPattern();
		System.out.println("\n\nSingleton Pattern:");
		singletonPattern();
		System.out.println("\n\nBridge Pattern:");
		bridgePattern();
		
	}

	public static void simpleFactory() {
		OperationFather op = SimpleOperation.getInstance("+");
		op.setNumA(1);
		op.setNumB(2);
		System.out.println(op.getResult());
	}

	public static void strategyPattern() {
		System.out.println("catcher want a horizontal slider ");
		BreakingBall pitching= new BreakingBall(new Slider());
		System.out.println("pitcher read the signal");
		System.out.println(pitching.pitch("horizontal", "right"));
		System.out.println("catcher want a vertical slider ");
		System.out.println("pitcher read the signal");
		System.out.println(pitching.pitch("vertical", "right"));
		System.out.println("catcher want a horizontal curve ball ");
		pitching= new BreakingBall(new CurveBall());
		System.out.println("pitcher read the signal");
		System.out.println(pitching.pitch("horizontal", "right"));
		System.out.println("catcher want a vertical slider ");
		System.out.println("pitcher read the signal");
		System.out.println(pitching.pitch("vertical", "right"));
	}

	public static void decoratorPattern() {
		Shape circle = new Circle();
		System.out.println("normal circle :");
		circle.draw();
		Shape coloredCircle = new ColorShapeDecorator(new Circle());
		System.out.println("circle with color:");
		coloredCircle.draw();
	}

	public static void proxyPattern() {
		FtpFile file = new ProxyFtpFile("test.txt");
		file.unzip();
		System.out.println("....");
		file.unzip();
	}

	public static void factoryMethodPattern() {
		OperationFactory factory = new OperationFactory();
		Ifactory f1 = factory.getOperation("ADD");
		f1.createOperaion();
		Ifactory f2 = factory.getOperation("SUB");
		f2.createOperaion();
	}

	public static void protoTypePattern() throws CloneNotSupportedException {
		ShapeCache.loadCache();

		ShapeProtoType clonedShape = (ShapeProtoType) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		ShapeProtoType clonedShape2 = (ShapeProtoType) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

	}

	public static void templatePattern() {
		GameTemplate game = new BasketBallGame();
		game.play();
		GameTemplate game2 = new BaseBallGame();
		game2.play();
	}

	public static void facadePattern() {
		Fund f1 = new Fund();
		f1.buyFund();
		System.out.println("And then we want to sell:");
		f1.sellFund();
	}

	public static void builderPattern() {
		MealBuilder mealBuilder = new MealBuilder();
		Meal nonVegMeal = mealBuilder.prepareMeal();
		System.out.println("(User don't need to know how to pack the meal)");
		System.out.println("Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

	public static void observerPattern() {
		Subject subject = new Subject();
		new NewsObserver(subject);
		new StockObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

	public static void abstractFactoryPattern() {
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;
		String os = System.getProperty("os.name");
		if (os.startsWith("Mac")) {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}

	public static void statePattern() {
		System.out.println("WAITING....");
		ElevatorStopState state = new ElevatorStopState();
		Context context = new Context(state);
		context.setFloor(0);
		state.handle(context);
		context.setFloor(2);
		state.handle(context);
		context.setFloor(10);
		state.handle(context);
	}

	public static void adapterPattern() {
		IronMan ironman = new IronMan();
		SpiderMan spiderman = new SpiderMan();
		HomeComingMovie spidermanHomeComing = new HomeComingMovie(ironman);
		System.out.println("ironman movie :");
		ironman.superability();
		ironman.movie();
		System.out.println("spiderman movie :");
		spiderman.power();
		spiderman.movie();
		// iron man not showing in spider man movie
		System.out.println("HomeComing movie as Adapter:");
		spidermanHomeComing.power();
		spidermanHomeComing.movie();
	}

	public static void mementoPattern() {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State1");
		originator.setState("State2");
		careTaker.add(originator.createMemento());
		originator.setState("State3");
		careTaker.add(originator.createMemento());
		originator.setState("State4");
		System.out.println("Current State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("First saved State: " + originator.getState());
		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("Second saved State: " + originator.getState());
		System.out.println("Third State will throw exection: size = " + careTaker.getMementoList().size());	
	}
	
	public static void compositePattern() {
		ConcreteCompany root = new ConcreteCompany("總公司");
		root.add(new HRDepartment("總公司人資部"));
		root.add(new ITDepartment("總公司資訊部"));
		
		ConcreteCompany branch = new ConcreteCompany("深圳分公司");
		branch.add(new HRDepartment("深圳分公司人資部"));
		branch.add(new ITDepartment("深圳分公司資訊部"));
		root.add(branch);
		root.display(1);
		root.lineDuties();
	}

	public static void iteratorPattern() {
		ConcreteIterator cit = new ConcreteIterator();
		for(Iterator it = cit.getIterator(); it.hasNext();){
			String name = (String) it.next();
			System.out.println(it.getCount()+" element is :"+name);
		}
		ConcreteIteratorDesc citdesc = new ConcreteIteratorDesc();
		for(Iterator it = citdesc.getIterator(); it.hasNext();){
			String name = (String) it.next();
			System.out.println(it.getCount()+" element is :"+name);
		}
	}
	
	public static void singletonPattern() {
	      //SingleObject object = new SingleObject();
	      SingleObject object = SingleObject.getInstance();
	      object.showMessage();
	      SingleObject object2 = SingleObject.getInstance();
	      object2.showMessage();
	      if(object==object2){
	    	  System.out.println("same instance");
	      }
	}
	
	public static void bridgePattern() {
			MobileBrand iphone8 = new Iphone("angry bird",new MobileGame());
			iphone8.run();
			MobileBrand samsung = new SamSung("angry bird",new MobileGame());
			samsung.run();
			iphone8 = new Iphone("calender",new MobileTool());
			iphone8.run();
			samsung = new SamSung("calender",new MobileTool());
			samsung.run();
	}
}
