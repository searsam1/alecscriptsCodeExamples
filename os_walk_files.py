# Program to collect code examples 
# from alecscripts
# Runs JS FILE `read_files.js`
import os

# MVC -> Model, view, controller
controllers_path = "/Users/111244rfsf/Documents/Repositories/alecScripts/Views"
# where the examples live (see top of the page)
write_path = "/Users/111244rfsf/Desktop/AScode/"


def get_folders(path):
    # get folders (folders are controllers)
    folders = [folder for folder in os.scandir(path) if folder.is_dir() 
        and folder.name.lower() not in ["home", "v2", "glossary", "shared"]] # ignore certain folders like home, v2, etc...
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
            try:
                # use mkdir instead of writing 
                # directory with JS
                
                # write to /Java /Python /...
                os.mkdir(write_path + controller)
            except FileExistsError:
                pass
            
            try:
                # write to /Java/View/name.randomNumber
                os.mkdir(write_path + controller + f"/{name}")
            except FileExistsError:
                pass
        
            ext = controller.lower()
            print(f"Collected  {name} {controller} {ext}")
            os.system(f"node ~/Documents/Repositories/alecscriptsCodeExamples/read_files.js {path} {name} {controller} {ext}")

def main():
    get_code()

if __name__ == "__main__":
    main()

