
import os

views_path = "/Users/111244rfsf/Documents/Repositories/alecScripts/Views"
def get_folders(path):
    folders = [folder for folder in os.scandir(path) if folder.is_dir()]
    return folders

views = get_folders(views_path)

for view in views:
    print(
        list(os.scandir(view))
    )
    break



