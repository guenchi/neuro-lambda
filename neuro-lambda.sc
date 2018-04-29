(define neuro-init
    (lambda (f g)
        (let ((state 1)(f f)(g g))
            (list 
                (lambda (x)
                    (let ((a (f state x #t)))
                        (set! state a))
                    (g x state))
                (lambda (x)
                    (let ((a (f state x #f)))
                        (set! state a))
                    (g x state))))))
