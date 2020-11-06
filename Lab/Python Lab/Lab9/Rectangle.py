import pygame
pygame.init()
win=pygame.display.set_mode(size=(500, 500))
pygame.display.set_caption("my pigame")
x,y=50,50
width=40
height=60
run=True
while run:
    
    for event in pygame.event.get():
        if event.type==pygame.QUIT:
               run=False     
    pygame.draw.rect(win,(255,0,0),(x,y,width,height))
    pygame.display.flip()
    

