<p align="center">
  <a href="https://www.instagram.com/mirzaf4eg/">
   <img src="https://user-images.githubusercontent.com/66875374/98158093-742a2900-1eeb-11eb-9353-5f31780195d2.png" width="27%"></img> 
   <img src="https://user-images.githubusercontent.com/66875374/98158339-c3705980-1eeb-11eb-9ac8-4d693db33447.png" width="35%"></img> 
  </a>
</p>
<h1 align="center">
  mirzaf4eg (c)
</h1>

<h3 align="center">
   <img src="https://user-images.githubusercontent.com/66875374/98164684-b7899500-1ef5-11eb-82ef-6340a335ee3d.png" width="45%"></img> 
</h3>
<h3 align="center">
  В моем коде прошу никого не винить. Я честно и добросовестно слизал все с просторов интернета. Я очень старался!
</h3>
<p align="center">
  Практические задания первого этапа курса:

<h3 align="center">
  <a href="https://careers.epam.by/training/training-listings/training.2332/">EPAM. Junior Test Automation Engineer in Java</a>
</h3>

# Содержимое репозитория:

- [Version Control with Git](#version-control-with-git)
- [Maven build tool](#maven-build-tool)
- [Continuous Integration with Jenkins](#continuous-integration-with-jenkins)
- [Java Fundamentals](#java-fundamentals)
- [Java Classes](#java-classes)
- [Clean Code](#clean-code)
- [Java Collections](#java-collections)

## Version Control with Git
<img src="https://user-images.githubusercontent.com/66875374/98221998-58fa0080-1f61-11eb-9ac5-e39acee8bd86.png" width="10%"></img>

**Nightmare!**

[Файл с выполненным заданием: Git_Task_Nigtmare.txt](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/git-task/Git_Task_Nigtmare.txt)

1. Создайте новый репозиторий на github.com и склонируйте его локально на свой компьютер.
    
    ```sh
    cd /d/EPAM/
	git clone git@github.com:mirzaf4eg/git-demo.git
	cd /d/EPAM/git-demo
    ```
    [git-demo](https://github.com/mirzaf4eg/git-demo.git)
     
2. Создайте файл названием song.txt и поместите туда половину текста любимой песни.
    
    ```sh
	echo "Come on, come on, turn the radio on" >> song.txt
	echo "It's Friday night and I won't be long" >> song.txt
	echo "Gotta do my hair, I put my make up on" >> song.txt
	echo "It's Friday night and I won't be long" >> song.txt
    ```

3. Сделайте коммит с названием "add first half of my favorite song" и отправьте его на сервер.

    ```sh
    git add song.txt
	git commit -m "add first half of my favorite song"
	git push
    ```
    
4. Убедитесь что на github есть файл song.txt с текстом песни. 
5. Используя веб-интерфейс гитхаба добавьте вторую половину текста песни и сделайте коммит с названием "finish my song".

	```sh
    # edit song.txt in remout git repo
	# >> Till I hit the dance floor
	# >> Hit the dance floor!
	# >> I got all I need
	# >> No I ain't got cash!
	# >> No I ain't got cash!
	# >> But I got you baby
	git pull
    ```

6. В локальном репозитории сделайте pull и убедитесь что коммит, который вы создали на github, подтянулся и у вас полный текст песни.
7. Добавьте в проект файл .gitignore и настройте так чтобы скрыть файлы с расширением .db, .log и директории с названиями target или bin.

	```sh
    echo "*.db" >> .gitignore
	echo "*.log" >> .gitignore
	echo "/target" >> .gitignore
	echo "/bin" >> .gitignore
    ```
    
8. Создайте ветку feature и добавьте в неё два коммита.

	```sh
    git checkout -b feature
	echo "Baby I don't need dollar bills to have fun tonight (I love cheap thrills)" >> song.txt
	echo "Baby I don't need dollar bills to have fun tonight (I love cheap thrills)" >> song.txt
	echo "I got all I need" >> song.txt
	git add song.txt
	git commit -m "feature commit one"
	echo "But I don't need no money" >> song.txt
	echo "As long as I can feel the beat" >> song.txt
	echo "I don't need no money" >> song.txt
	echo "As long as I keep dancing" >> song.txt
	git add song.txt
	git commit -m "feature commit two"
    ```
    
9. Смержите ветку feature в master.

	```sh
    git checkout master
	git merge feature
    ```
    
10. Вернитесь в feature и создайте файл arrows.txt cледующего содержания:
	>  _The ship glides gently on the waves_

    > _As day turns into night_
    
	```sh
    git checkout feature
	echo "The ship glides gently on the waves" >> arrows.txt
	echo "As day turns into night" >> arrows.txt
    ```
11. Выполните коммит.
    
	```sh
    git add arrows.txt
	git commit -m "feature commit post added arrow.txt"
    ```
    
12. Перейдите в master. Создайте там файл arrows.txt и добавьте следующий текст:
	> _One thousand burning arrows_

    > _Fill the starlit sky_
    
	```sh
    git checkout master
	echo "One thousand burning arrows" >> arrows.txt
	echo "Fill the starlit sky" >> arrows.txt
    ```
    
13. Выполните коммит.

	```sh
    git add arrows.txt
	git commit -m "master commit post added arrow.txt"
    ```
	
14. Смержите feature в master решив конфликт: сохраните все 4 строки в файле arrows.txt в порядке их добавления в пунктах 4 и 5.

    ```sh
    git merge feature
	# edit arrows.txt in github.com
	vi arrows.txt
	git add arrows.txt
	git commit -m "edit conflict in arrow.txt"
    ```

15. Создайте ветку storm и добавьте коммит в файл storm.txt:
	> _Twenty ships with Norsemen braves_
    
    > _Riding the northern wind_

	```sh
    git checkout -b storm
	echo "Twenty ships with Norsemen braves" >> storm.txt
	echo "Riding the northern wind" >> storm.txt
	git add storm.txt
	git commit -m "storm commit one"
    ```
    
16. Добавьте еще 2 строки в storm.txt и сделайте еще один коммит:
    > _They left their shores at early dawn_

    > _As a red sun was rising in the east_
    
	```sh
    echo "They left their shores at early dawn" >> storm.txt
	echo "As a red sun was rising in the east" >> storm.txt
	git add storm.txt
	git commit -m "storm commit two"
    ```
    
17. Вернитесь в master и создайте файл pursuit.txt с текстом ниже:
	> _The warming sun returns again_

    > _And melts away the snow_
    
    > _The sea is freed from icy chains_
    
    > _Winter is letting go_

	```sh
    git checkout master
	echo "The warming sun returns again" >> pursuit.txt
	echo "And melts away the snow" >> pursuit.txt
	echo "The sea is freed from icy chains" >> pursuit.txt
	echo "Winter is letting go" >> pursuit.txt
    ```

18. Выполните коммит.
    
    ```sh
    git add pursuit.txt
	git commit -m "commit added pursuit.txt"
    ```
    
19. Отметьте коммит тегом session1 и перейдите в ветку storm.

	```sh
    git tag session1
	git checkout storm
    ```
    
20. Сделайте rebase ветки storm так чтобы она содержала последний коммит из мастера.

	```sh
    git rebase master
    ```

21. Сделайте push вашего репозитория и убедитесь, что все коммиты есть на github.
22. Сделайте новый репозиторий на github.

	```sh
    # creat repo "git-demo-back" in github.com
    ```
    [git-demo-back](https://github.com/mirzaf4eg/git-demo-back.git)
    
23. Смените remote в локальном репозитории так, чтобы fetch и push шел на новый репозиторий который был создан в предыдущем шаге.

	```sh
    git remote remove origin
	git remote add origin git@github.com:mirzaf4eg/git-demo-back.git
    ```
    
24. Сделайте push и убедитесь, что второй репозиторий на гитхабе выглядит так же, как и первый. 
	
    ```sh
    git push --set-upstream origin master
    ```
    
25. Верните настройки remote в исходное состояние: пул и пуш первого локального репозитория ведет в один удаленный репозиторий на гитхабе.

	```sh
    git remote remove origin
	git remote add origin git@github.com:mirzaf4eg/git-demo.git
	git push --set-upstream origin master
    ```

[Вернуться к содержанию](#содержимое-репозитория)

## Maven build tool
<img src="https://user-images.githubusercontent.com/66875374/98226436-14716380-1f67-11eb-94e3-2dc3b3d3fad2.png" width="15%"></img>

1. Установите мавен убедитесь, что он работает.

<img src="https://user-images.githubusercontent.com/66875374/98232363-a03abe00-1f6e-11eb-892b-03ae83133584.png" width="100%"></img>

2. Загрузите тестовый проект отсюда https://github.com/vitalliuss/helloci/tree/master/Java

	[Тестовый проект](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/tree/master/maven-task/hello-ci)

3. Соберите его мавеном с помощь цели test.

<img src="https://user-images.githubusercontent.com/66875374/98233783-91550b00-1f70-11eb-87f8-1a45c3cd40d0.png" width="100%"></img> 

4. Найдите библиотеки junit в папке c:\Users\User_Name\.m2\repository\ и посмотрите на дату создания файлов.

5. Измените версию junit в файле pom.xml c 4.12 на 4.11 и соберите проект снова. Проверьте, что новая версия библиотеки добавилась в .m2/repository.

<img src="https://user-images.githubusercontent.com/66875374/98234327-57383900-1f71-11eb-99e1-0412c7a78b2f.png" width="100%"></img>

[Вернуться к содержанию](#содержимое-репозитория)

## Continuous Integration with Jenkins
<img src="https://user-images.githubusercontent.com/66875374/98227492-6ff02100-1f68-11eb-8d21-f6a1c0a8a52d.jpg" width="15%"></img>

**Nightmare!**

1. Установите Jenkins.

[Файл конфигурации Jenkins](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/jenkins-task/config(jenkins).xml)

2. Создать ноду и настроить сервер так, чтобы джоба выполнялась только на **slave** ноде.

[Файл конфигурации жобы основного задания](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/jenkins-task/config(jobTask).xml)

   Использую виртуальную машину с CentOS:
		
<img src="https://user-images.githubusercontent.com/66875374/98385946-a741f900-2060-11eb-8903-448d4cb09a17.png" width="45%"></img> <img src="https://user-images.githubusercontent.com/66875374/98386053-cb9dd580-2060-11eb-9ffc-520c9b4cec02.png" width="45%"></img>

[Файл конфигурации Node](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/jenkins-task/config(node).xml)

Структура каталогов на удаленной ноде:

<img src="https://user-images.githubusercontent.com/66875374/98436454-832bf980-20ec-11eb-96c5-f017028b19f4.png" width="100%"></img> 

3. Создайте задачу, которая будет делать следующее:

Клонировать проект:
    [Тестовый проект](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/tree/master/maven-task/hello-ci)
    
```html
<scm class="hudson.plugins.git.GitSCM" plugin="git@4.4.5">
   <configVersion>2</configVersion>
   <userRemoteConfigs>
      <hudson.plugins.git.UserRemoteConfig>
         <url>https://github.com/vitalliuss/helloci</url>
      </hudson.plugins.git.UserRemoteConfig>
   </userRemoteConfigs>
   <branches>
      <hudson.plugins.git.BranchSpec>
         <name>*/master</name>
      </hudson.plugins.git.BranchSpec>
   </branches>
   <doGenerateSubmoduleConfigurations>false</doGenerateSubmoduleConfigurations>
   <gitTool>2.18.4</gitTool>
   <submoduleCfg class="list"/>
   <extensions/>
</scm>
```

   Запускать тесты из проекта в директори Java с помощью цели mvn test.
   
> test -Dmaven.test.failure.ignore=true   

```html
<hudson.tasks.Maven>
   <targets>test -Dmaven.test.failure.ignore=true</targets>
   <mavenName>linux maven</mavenName>
   <pom>/home/Jenkins/workspace/EPAM-continuous-integration-with-Jenkins-from-mirzaf4eg/Java/pom.xml</pom>
   <usePrivateRepository>false</usePrivateRepository>
   <settings class="jenkins.mvn.DefaultSettingsProvider"/>
   <globalSettings class="jenkins.mvn.DefaultGlobalSettingsProvider"/>
   <injectBuildVariables>false</injectBuildVariables>
</hudson.tasks.Maven>
```

4. Настроить билд тригеры так, чтобы задача выполнялась раз в 5 минут, не позднее чем через 5 минут после коммита в git, каждый будний день в полночь.
    
```html
<triggers>
   <hudson.triggers.TimerTrigger>
   	  <spec>H/5 * * * *
H 0 * * 1-5</spec>
   </hudson.triggers.TimerTrigger>
   <hudson.triggers.SCMTrigger>
      <spec>H/5 * * * *</spec>
      <ignorePostCommitHooks>false</ignorePostCommitHooks>
   </hudson.triggers.SCMTrigger>
</triggers>
```
    
5. Опубликуйте файл _Java\target\surefire eports\com.github.vitalliuss.helloci.AppTest.txt_ как артефакт.

```html
<hudson.tasks.ArtifactArchiver>
   <artifacts>**/target/surefire-reports/com.github.vitalliuss.helloci.AppTest.txt</artifacts>
   <allowEmptyArchive>false</allowEmptyArchive>
   <onlyIfSuccessful>false</onlyIfSuccessful>
   <fingerprint>false</fingerprint>
   <defaultExcludes>true</defaultExcludes>
   <caseSensitive>true</caseSensitive>
   <followSymlinks>false</followSymlinks>
</hudson.tasks.ArtifactArchiver>
```

6. Сменить порт сервера на **8081**.

[Фал настроек Jenkins](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/jenkins-task/jenkins(setting).xml)

7. Настроить **Job Config History** и **thinBackup**.

```html
<?xml version='1.1' encoding='UTF-8'?>
<org.jvnet.hudson.plugins.thinbackup.ThinBackupPluginImpl plugin="thinBackup@1.10">
  <fullBackupSchedule>H 12 * * 1-5</fullBackupSchedule>
  <diffBackupSchedule></diffBackupSchedule>
  <backupPath>G:\JenkinsBackup</backupPath>
  <nrMaxStoredFull>-1</nrMaxStoredFull>
  <excludedFilesRegex></excludedFilesRegex>
  <waitForIdle>true</waitForIdle>
  <forceQuietModeTimeout>120</forceQuietModeTimeout>
  <cleanupDiff>true</cleanupDiff>
  <moveOldBackupsToZipFile>true</moveOldBackupsToZipFile>
  <backupBuildResults>true</backupBuildResults>
  <backupBuildArchive>true</backupBuildArchive>
  <backupPluginArchives>false</backupPluginArchives>
  <backupUserContents>false</backupUserContents>
  <backupAdditionalFiles>false</backupAdditionalFiles>
  <backupAdditionalFilesRegex></backupAdditionalFilesRegex>
  <backupNextBuildNumber>false</backupNextBuildNumber>
  <backupBuildsToKeepOnly>false</backupBuildsToKeepOnly>
</org.jvnet.hudson.plugins.thinbackup.ThinBackupPluginImpl>
```

9. С помощью цели  **mvn cobertura:cobertura** измерьте покрытие кода юнит-тестами (code coverage) и опубликуйте на странице джобы в виде графика.

> clean cobertura:cobertura -Dcobertura.report.format=xml

<img src="https://user-images.githubusercontent.com/66875374/98412658-64484b80-2089-11eb-9a21-18abf5492b70.png" width="100%"></img> 

8. Создать пользователя **user** и дать ему права на просмотр джоб Jenkins, но без возможности записи или смены настроек.

[Файл конфигурации user](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/jenkins-task/config(user).xml)

<img src="https://user-images.githubusercontent.com/66875374/98414742-f9007880-208c-11eb-9dad-3ef0a03121dc.png" width="100%"></img> 

9. Создать параметризованную джобу **HelloUser**, которая будет спрашивать в качестве параметра имя пользователя (username) и писать в консоль "Hello, username!".

[Файл конфигурации жобы](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/jenkins-task/jenkins(HelloUser).xml)

[Вернуться к содержанию](#содержимое-репозитория)

## Java Fundamentals
<img src="https://user-images.githubusercontent.com/66875374/98227805-ca897d00-1f68-11eb-8269-31d7be0f9a2e.jpg" width="15%"></img>

- [Main Task](#main-task)
- [Optional Task First](#optional-task-first)
- [Optional Task Second](#optional-task-second)

### Main Task
Реализовать следующие программы:

[1. Приветствовать любого пользователя при вводе его имени через командную строку.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/MainTask/TaskFirst.java)

[2. Отобразить в окне консоли аргументы командной строки в обратном порядке.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/MainTask/TaskSecond.java)

[3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/MainTask/TaskThird.java)

[4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/MainTask/TaskFourth.java)

[5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/MainTask/TaskFive.java)

### Optional Task First
Ввести n чисел с консоли.

[Main class](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/Main.java)

[Service class](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/OptionalTaskFirst.java)

[1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/TaskFirst.java)

[2. Вывести числа в порядке возрастания (убывания) значений их длины.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/TaskSecond.java)

[3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/TaskThird.java)

[4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/TaskFourth.java)

[5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/TaskFive.java)

[6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/TaskSix.java)

[7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskFirst/TaskSeven.java)

### Optional Task Second
Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).

[Main class](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskSecond/Main.java)

[Service class](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskSecond/OptionalTaskSecond.java)

[1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskSecond/TaskFirst.java)

[2. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskSecond/TaskSecond.java)

[3. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskSecond/TaskThird.java)

[4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие.](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaFund/OptionalTaskSecond/TaskFour.java)

[Вернуться к содержанию](#содержимое-репозитория)

## Java Classes
<img src="https://user-images.githubusercontent.com/66875374/98227805-ca897d00-1f68-11eb-8269-31d7be0f9a2e.jpg" width="15%"></img>

Cоздать классы, определить конструкторы и методы _setТип()_, _getТип()_, _toString()_. Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

    8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
> Создать массив объектов. Вывести:
a) список автомобилей заданной марки;
b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
c) список автомобилей заданного года выпуска, цена которых больше указанной.

[pakcage](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/tree/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses)

 - [Main class](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/MainAuto.java)
 - [Work class](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/Mirzaf4egAutoPark.java)
 - [Сonstructor](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/Cars/Car.java)
 - [Specifications](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/tree/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/Specifications)
        - [Brand](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/Specifications/Brand.java)
        - [CarColor](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/Specifications/CarColor.java)
        - [CarType](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/Specifications/CarType.java)
        - [EngineType](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/mirzaf4eg-task-part-one/src/main/java/JavaClasses/Specifications/EngineType.java)
[Вернуться к содержанию](#содержимое-репозитория)

## Clean Code
<img src="https://user-images.githubusercontent.com/66875374/98227805-ca897d00-1f68-11eb-8269-31d7be0f9a2e.jpg" width="15%"></img> <img src="https://user-images.githubusercontent.com/66875374/98228421-9ebac700-1f69-11eb-9f96-242d350ddd4d.jpg" width="15%"></img>

[Вернуться к содержанию](#содержимое-репозитория)

## Java Collections
<img src="https://user-images.githubusercontent.com/66875374/98227805-ca897d00-1f68-11eb-8269-31d7be0f9a2e.jpg" width="15%"></img>

- [Main Task](#main-task)
- [Optional Task](#optional-task)

### Main Task

### Optional Task

[Вернуться к содержанию](#содержимое-репозитория)

## :memo: License

Licensed under the [MIT License](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/LICENSE.txt).

## 💜 Thanks

<p align="center">
   <img src="https://user-images.githubusercontent.com/66875374/98436488-b7071f00-20ec-11eb-8fc0-43ab2b93aee8.gif" width="30%"></img>
</p>

[Вернуться к содержанию](#содержимое-репозитория)
