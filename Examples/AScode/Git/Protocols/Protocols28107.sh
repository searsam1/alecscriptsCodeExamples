cd /var/www/htdocs/
git clone --bare /path/to/git_project gitproject.git
cd gitproject.git
mv hooks/post-update.sample hooks/post-update
chmod a+x hooks/post-update
