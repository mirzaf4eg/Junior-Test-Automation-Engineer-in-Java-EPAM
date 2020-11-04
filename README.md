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
  Практические задания первого этапа курса.

<h3 align="center">
  <a href="https://careers.epam.by/training/training-listings/training.2332/">Junior Test Automation Engineer in Java</a>
</h3>

## Содержание репозитория:

- [Version Control with Git](#-get-up-and-running-in-5-minutes)
- [Learning Gatsby](#-learning-gatsby)
- [Migration Guides](#-migration-guides)
- [How to Contribute](#-how-to-contribute)
- [License](#memo-license)
- [Thanks to Our Contributors and Sponsors](#-thanks)

## Version Control with Git

**Nightmare!**

[Файл с выполненным заданием: Git_Task_Nigtmare.txt](https://github.com/mirzaf4eg/Junior-Test-Automation-Engineer-in-Java-EPAM/blob/master/git-task/Git_Task_Nigtmare.txt)

1. Создайте новый репозиторий на github.com и склонируйте его локально на свой компьютер.
    
    ```
    cd /d/EPAM/
	git clone git@github.com:mirzaf4eg/git-demo.git
	cd /d/EPAM/git-demo
    ```
2. Создайте файл названием song.txt и поместите туда половину текста любимой песни.
    
    ```
	echo "Come on, come on, turn the radio on" >> song.txt
	echo "It's Friday night and I won't be long" >> song.txt
	echo "Gotta do my hair, I put my make up on" >> song.txt
	echo "It's Friday night and I won't be long" >> song.txt
    ```

3. Сделайте коммит с названием "add first half of my favorite song" и отправьте его на сервер.

    ```
    git add song.txt
	git commit -m "add first half of my favorite song"
	git push
    ```
    
4. Убедитесь что на github есть файл song.txt с текстом песни. 
5. Используя веб-интерфейс гитхаба добавьте вторую половину текста песни и сделайте коммит с названием "finish my song".

	```
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

	```
    echo "*.db" >> .gitignore
	echo "*.log" >> .gitignore
	echo "/target" >> .gitignore
	echo "/bin" >> .gitignore
    ```
    
8. Создайте ветку feature и добавьте в неё два коммита.

	```
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
    
9. Смержите ветку feature в master.

	```
    git checkout master
	git merge feature
    ```
    
10. Вернитесь в feature и создайте файл arrows.txt cледующего содержания:
	- The ship glides gently on the waves
	- As day turns into night

	```
    git checkout feature
	echo "The ship glides gently on the waves" >> arrows.txt
	echo "As day turns into night" >> arrows.txt
    ```

11. Выполните коммит.
    
	```
    git add arrows.txt
	git commit -m "feature commit post added arrow.txt"
    ```
    
12. Перейдите в master. Создайте там файл arrows.txt и добавьте следующий текст:
	- One thousand burning arrows
	- Fill the starlit sky
    
	```
    git checkout master
	echo "One thousand burning arrows" >> arrows.txt
	echo "Fill the starlit sky" >> arrows.txt
    ```
    
13. Выполните коммит.

	```
    git add arrows.txt
	git commit -m "master commit post added arrow.txt"
    ```
	
14. Смержите feature в master решив конфликт: сохраните все 4 строки в файле arrows.txt в порядке их добавления в пунктах 4 и 5.

    ```
    git merge feature
	# edit arrows.txt in github.com
	vi arrows.txt
	git add arrows.txt
	git commit -m "edit conflict in arrow.txt"
    ```

15. Создайте ветку storm и добавьте коммит в файл storm.txt:
	- Twenty ships with Norsemen braves
	- Riding the northern wind

	```
    git checkout -b storm
	echo "Twenty ships with Norsemen braves" >> storm.txt
	echo "Riding the northern wind" >> storm.txt
	git add storm.txt
	git commit -m "storm commit one"
    ```
    
16. Добавьте еще 2 строки в storm.txt и сделайте еще один коммит:
    - They left their shores at early dawn
	- As a red sun was rising in the east
    
	```
    echo "They left their shores at early dawn" >> storm.txt
	echo "As a red sun was rising in the east" >> storm.txt
	git add storm.txt
	git commit -m "storm commit two"
    ```
    
17. Вернитесь в master и создайте файл pursuit.txt с текстом ниже:
	- The warming sun returns again
	- And melts away the snow
	- The sea is freed from icy chains
	- Winter is letting go

	```
    git checkout master
	echo "The warming sun returns again" >> pursuit.txt
	echo "And melts away the snow" >> pursuit.txt
	echo "The sea is freed from icy chains" >> pursuit.txt
	echo "Winter is letting go" >> pursuit.txt
    ```

18. Выполните коммит.
    
    ```
    git add pursuit.txt
	git commit -m "commit added pursuit.txt"
    ```
    
19. Отметьте коммит тегом session1 и перейдите в ветку storm.

	```
    git tag session1
	git checkout storm
    ```
    
20. Сделайте rebase ветки storm так чтобы она содержала последний коммит из мастера.

	```
    git rebase master
    ```

21. Сделайте push вашего репозитория и убедитесь, что все коммиты есть на github.
22. Сделайте новый репозиторий на github.

	```
    # creat repo "git-demo-back" in github.com
    ```
    
23. Смените remote в локальном репозитории так, чтобы fetch и push шел на новый репозиторий который был создан в предыдущем шаге.

	```
    git remote remove origin
	git remote add origin git@github.com:mirzaf4eg/git-demo-back.git
    ```
    
24. Сделайте push и убедитесь, что второй репозиторий на гитхабе выглядит так же, как и первый. 
	
    ```
    git push --set-upstream origin master
    ```
    
25. Верните настройки remote в исходное состояние: пул и пуш первого локального репозитория ведет в один удаленный репозиторий на гитхабе.

	```
    git remote remove origin
	git remote add origin git@github.com:mirzaf4eg/git-demo.git
	git push --set-upstream origin master
    ```
    


    
2. **Create a Gatsby site from a Gatsby starter.**

   Get your Gatsby blog set up in a single command:

   ```shell
   # create a new Gatsby site using the default starter
   gatsby new my-blazing-fast-site
   ```

3. **Start the site in `develop` mode.**

   Next, move into your new site’s directory and start it up:

   ```shell
   cd my-blazing-fast-site/
   gatsby develop
   ```

4. **Open the source code and start editing!**

   Your site is now running at `http://localhost:8000`. Open the `my-blazing-fast-site` directory in your code editor of choice and edit `src/pages/index.js`. Save your changes, and the browser will update in real time!

At this point, you’ve got a fully functional Gatsby website. For additional information on how you can customize your Gatsby site, see our [plugins](https://gatsbyjs.com/plugins/) and [the official tutorial](https://www.gatsbyjs.com/tutorial/).

##  Learning Gatsby

Full documentation for Gatsby lives [on the website](https://www.gatsbyjs.com/).

- **For most developers, we recommend starting with our [in-depth tutorial for creating a site with Gatsby](https://www.gatsbyjs.com/tutorial/).** It starts with zero assumptions about your level of ability and walks through every step of the process.

- **To dive straight into code samples head [to our documentation](https://www.gatsbyjs.com/docs/).** In particular, check out the �?i>Guides</i>�? �?i>API Reference</i>�? and �?i>Advanced Tutorials</i>�?sections in the sidebar.

We welcome suggestions for improving our docs. See the [“how to contribute”](https://www.gatsbyjs.com/contributing/how-to-contribute/) documentation for more details.

**Start Learning Gatsby: [Follow the Tutorial](https://www.gatsbyjs.com/tutorial/) · [Read the Docs](https://www.gatsbyjs.com/docs/)**

## 💼 Migration Guides

Already have a Gatsby site? These handy guides will help you add the improvements of Gatsby v2 to your site without starting from scratch!

- [Migrate a Gatsby site from v1 to v2](https://www.gatsbyjs.com/docs/migrating-from-v1-to-v2/)
- Still on v0? Start here: [Migrate a Gatsby site from v0 to v1](https://www.gatsbyjs.com/docs/migrating-from-v0-to-v1/)

## �?Code of Conduct

Gatsby is dedicated to building a welcoming, diverse, safe community. We expect everyone participating in the Gatsby community to abide by our [**Code of Conduct**](https://www.gatsbyjs.com/contributing/code-of-conduct/). Please read it. Please follow it. In the Gatsby community, we work hard to build each other up and create amazing things together. 💪💜

## 🤝 How to Contribute

Whether you're helping us fix bugs, improve the docs, or spread the word, we'd love to have you as part of the Gatsby community! :muscle::purple_heart:

Check out our [**Contributing Guide**](https://www.gatsbyjs.com/contributing/how-to-contribute/) for ideas on contributing and setup steps for getting our repositories up and running on your local machine.

### A note on how this repository is organized

This repository is a [monorepo](https://trunkbaseddevelopment.com/monorepos/) managed using [Lerna](https://github.com/lerna/lerna). This means there are [multiple packages](/packages) managed in this codebase, even though we publish them to NPM as separate packages.

### Contributing to Gatsby v1

We are currently only accepting bug fixes for Gatsby v1. No new features will be accepted.

## :memo: License

Licensed under the [MIT License](./LICENSE).

## 💜 Thanks

Thanks to our many contributors and to [Netlify](https://www.netlify.com/) for hosting [Gatsby](https://www.gatsbyjs.com) and our example sites.
