import pygame    
pygame.init()    
pygame.display.set_caption(u'Mouse events')    
pygame.display.set_mode((400, 400))    
while True:        
    event = pygame.event.wait()        
    if event.type == pygame.QUIT:            
        break
    
        # if any mouse button is pressed
    if event.type == pygame.MOUSEBUTTONDOWN:
        # prints on the console the pressed button and its position at that moment
        print(event.button, 'button pressed in the position', event.pos)
        
    # if any mouse button is released
    if event.type == pygame.MOUSEBUTTONUP:
        # prints on the console the button released and its position at that moment
        print(event.button, 'button released in the position', event.pos)
        
    # if the mouse is moved
    if event.type == pygame.MOUSEMOTION:
        # prints on the console the pressed buttons, and their position and relative movement at that time
        print('pressed buttons {}, position {} and relative movement {}'.format(event.buttons, event.pos, event.rel))
# finalizes Pygame
pygame.quit()
