Git Task:
cd /d/EPAM/
git clone git@github.com:mirzaf4eg/git-demo.git
cd /d/EPAM/git-demo
echo "Come on, come on, turn the radio on" >> song.txt
echo "It's Friday night and I won't be long" >> song.txt
echo "Gotta do my hair, I put my make up on" >> song.txt
echo "It's Friday night and I won't be long" >> song.txt
git add song.txt
git commit -m "add first half of my favorite song"
git push
# edit song.txt in remout git repo
# >> Till I hit the dance floor
# >> Hit the dance floor!
# >> I got all I need
# >> No I ain't got cash!
# >> No I ain't got cash!
# >> But I got you baby
git pull

echo "*.db" >> .gitignore
echo "*.log" >> .gitignore
echo "/target" >> .gitignore
echo "/bin" >> .gitignore
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
git checkout master
git merge feature
git checkout feature
echo "The ship glides gently on the waves" >> arrows.txt
echo "As day turns into night" >> arrows.txt
git add arrows.txt
git commit -m "feature commit post added arrow.txt"
git checkout master
echo "One thousand burning arrows" >> arrows.txt
echo "Fill the starlit sky" >> arrows.txt
git add arrows.txt
git commit -m "master commit post added arrow.txt"
git merge feature
# edit arrows.txt in github.com
vi arrows.txt
git add arrows.txt
git commit -m "edit conflict in arrow.txt"

git checkout -b storm
echo "Twenty ships with Norsemen braves" >> storm.txt
echo "Riding the northern wind" >> storm.txt
git add storm.txt
git commit -m "storm commit one"
echo "They left their shores at early dawn" >> storm.txt
echo "As a red sun was rising in the east" >> storm.txt
git add storm.txt
git commit -m "storm commit two"
git checkout master
echo "The warming sun returns again" >> pursuit.txt
echo "And melts away the snow" >> pursuit.txt
echo "The sea is freed from icy chains" >> pursuit.txt
echo "Winter is letting go" >> pursuit.txt
git add pursuit.txt
git commit -m "commit added pursuit.txt"
git tag session1
git checkout storm
git rebase master

# creat repo "git-demo-back" in github.com
git remote remove origin
git remote add origin git@github.com:mirzaf4eg/git-demo-back.git
git push --set-upstream origin master
git remote remove origin
git remote add origin git@github.com:mirzaf4eg/git-demo.git
git push --set-upstream origin master
