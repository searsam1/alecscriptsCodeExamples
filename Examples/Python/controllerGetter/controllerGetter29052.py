

import re
import os


def title_split(s):

    res = ''
    for i in range(1, len(s)):
        if s[i-1].islower() and s[i].isupper():
            res += " "
        res += s[i]
    return s[0] + res


def asp_link(controller, action):
    string = f"""  {title_split(action)}  """
    return string


def get_actions(fn, control):
    actions = []
    p = r"IActionResult (\w+)"
    fp = fn + "/" + control
    with open(fp, "r") as f:
        lines = f.readlines()
    for line in lines:
        matches = re.findall(p, line)
        if matches:
            actions.append(matches[0])
    return actions



def get_controls():
    fp = "Controllers"
    fn,_, controls = list(os.walk(fp))[0]
    
    for control in controls:
        actions = get_actions(fn, control)

        print(f'<nav class="sidebarHeader">{control.split("Controller.cs")[0]}<nav>')
        for action in actions:
            asp = asp_link(control.split("Controller.cs")[0], action)    
            print(asp)
            


get_controls()

