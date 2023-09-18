import RPi.GPIO as GPIO
import time

led_pin=18

GPIO.setmode(GPIO.BCM)

GPIO.setup(led_pin, GPIO.OUT)

pwm=GPIO.PWM(led_pin, 1000.0) # 1.0Hz
pwm.start(0.0) # 0.0~100.0

try:
    while True:
          for t_high in range(0,10):
          pwm.ChangeDutyCycle(t_high)
          time.sleep(0.01)
except KeyboardInterrupt:
    pass
    
pwm.stop()
GPIO.cleanup()
