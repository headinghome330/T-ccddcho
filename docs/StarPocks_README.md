StarPocks 是什麼？
==================

~~Java + Mermaid = Starbucks → StarPocks（意義不明）~~

StarPocks 是一個將 Java class（們）自動轉換成 Mermaid.js class diagram 語法的工具。

如果自己實做各個 `Writer`，也可以轉換成其他格式。請參見「可以客製化嗎？」段落。



怎麼用？
========

> 十分抱歉，目前在任何一個 Maven Repo 都找不到。
> 必須自行 clone 之後做 `mvn install` ...... Orz


As a library 
------------

Maven：

```XML
<dependencies>
	<dependency>
		<groupId>us.dontcareabout</groupId>
		<artifactId>StarPocks</artifactId>
		<version>0.0.1-SNAPSHOT</version>
	</dependency>
</dependencies>
```

Java：

```Java
System.out.println(
	new ClassDiagram().write(
		IllegalStateException.class,
		ArrayIndexOutOfBoundsException.class,
		StackOverflowError.class
	)
);
```


As a Maven plugin
-----------------

[to be continued]()


可以客製化嗎？
==============

[to be continued]()


StarPocks 的限制？
==================

主要是受限於 Java Reflection（以及 Don'tCare 的技術能力 :sob:）：

+ 無法顯示 generic type
