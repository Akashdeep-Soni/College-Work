import pygame
pygame.init()
win=pygame.display.set_mode(size=(500, 500))
pygame.display.set_caption("my pigame")
x,y=50,50
width=40
height=60
vel=5
run=True
while run:
    pygame.time.delay(5)
    for event in pygame.event.get():
        if event.type==pygame.QUIT:
               run=False
    keys=pygame.key.get_pressed()
    if keys[pygame.K_LEFT] and x>vel:
        x-=vel
    if keys[pygame.K_RIGHT] and x<500-width:
        x+=vel
    if keys[pygame.K_UP] and y>vel:
        y-=vel
    if keys[pygame.K_DOWN] and y<500-height:
        y+=vel
    win.fill((0,0,0))
    pygame.draw.rect(win,(255,0,0),(x,y,width,height))
    pygame.display.flip()
    

