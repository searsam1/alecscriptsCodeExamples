# Program to collect code examples 
# from alecscripts
# Runs JS FILE `read_files.js`
from datetime import datetime
import os

# MVC -> Model, view, controller
controllers_path = "/Users/111244rfsf/Documents/Repositories/alecScripts/Views"
# where the examples live (see top of the page)
write_path = "/Users/111244rfsf/Desktop/AScode/"
 
# convert lang to extension: 
# python -> py, c++ -> cpp, ...
extensions = dict(zip("""Bash Go Cpp Html Css Java Js Git Python Sass""".split(), 
            "sh go cpp html css java js sh py scss".split()))


def get_folders(path):
    # get folders (folders are controllers)
    folders = [folder for folder in os.scandir(path) if folder.is_dir() 
        and folder.name.lower() not in ["home", "v2", "glossary", "shared", "challenges", "seo", "dotnet"]] # ignore certain folders like home, v2, etc...
    return folders

def get_code():
    print("Collecting Code Examples...")
    # /Java, /Python, /... 
    controllers = get_folders(controllers_path)
    for controller in controllers:
        # each controller has separate 
        # files called views
        views = list(os.scandir(controller))
        
        # for each file in controller dir
        for view in views:
            path = view.path
            name = view.name.split(".")[0]
            # .../Controller/filename.cshtml
            controller = view.path.split("/")[-2]
            
            # makedirs to create subdirs
            # exist_ok=True is for avoiding 
            # fileExistsError 
            
            # (over writing is fine)
            os.makedirs(write_path + controller + f"/{name}", exist_ok=True)
        
            ext =  extensions.get(controller, controller)
            print(f"Collected  {name} {controller}")
            # run node read_files.js
            os.system(f"node ~/Documents/Repositories/alecscriptsCodeExamples/read_files.js {path} {name} {controller} {ext}")

    def push_to_git():
        os.chdir("/Users/111244rfsf/Documents/Repositories/alecscriptsCodeExamples")
        os.system("cp -R /Users/111244rfsf/Desktop/AScode Examples")

        print("git push")
        commit_message = f"'Updating examples on {datetime.now().strftime('%c')}'"
        os.system("git add *")
        os.system(f"git commit -m {commit_message}")
        os.system("git push")

    
    push_to_git()



def main():
    get_code()

if __name__ == "__main__":
    main()

